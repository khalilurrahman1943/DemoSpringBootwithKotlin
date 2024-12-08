// MessageRepository.kt
package org.example.demospringboot

import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String>