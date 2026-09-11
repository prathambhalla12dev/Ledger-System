package com.prathamBhalla.paymentledger.repository;

import com.prathamBhalla.paymentledger.domain.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NotificationRepository extends JpaRepository<Notification, UUID> {
}
