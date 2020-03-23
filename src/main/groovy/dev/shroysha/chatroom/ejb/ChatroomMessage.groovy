package dev.shroysha.chatroom.ejb

import lombok.Getter
import lombok.NoArgsConstructor
import lombok.NonNull
import lombok.RequiredArgsConstructor

import javax.persistence.*

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
class ChatroomMessage {


    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long messageId

    @Getter
    @NonNull
    @ManyToOne
    private ChatroomUser messageSender

    @Getter
    @NonNull
    private String messageContent


    static String getTimeString() {
        Calendar time = Calendar.getInstance()
        int hour = time.get(Calendar.HOUR)
        int minute = time.get(Calendar.MINUTE)
        int second = time.get(Calendar.SECOND)

        String hourText, minuteText, secondText
        if (hour / 10 == 0) hourText = "0" + hour
        else hourText = "" + hour
        if (minute / 10 == 0) minuteText = "0" + minute
        else minuteText = "" + minute
        if (second / 10 == 0) secondText = "0" + second
        else secondText = "" + second

        return "" + hourText + ":" + minuteText + ":" + secondText
    }

}
