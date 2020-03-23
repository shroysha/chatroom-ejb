package dev.shroysha.chatroom.ejb

import org.springframework.data.jpa.repository.JpaRepository

interface ChatroomMessageRepo extends JpaRepository<ChatroomMessage, Long> {
}
