package dev.shroysha.chatroom.ejb

import org.springframework.data.jpa.repository.JpaRepository

interface ChatroomUserRepo extends JpaRepository<ChatroomUser, String> {
}
