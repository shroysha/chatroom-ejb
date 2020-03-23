package dev.shroysha.chatroom.ejb

import lombok.Getter
import lombok.NoArgsConstructor
import lombok.NonNull
import lombok.RequiredArgsConstructor

import javax.persistence.Entity
import javax.persistence.Id

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
class ChatroomUser {

    @Getter
    @Id
    @NonNull
    private String userId

}

