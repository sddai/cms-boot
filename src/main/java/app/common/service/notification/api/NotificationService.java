package app.common.service.notification.api;

import app.persistence.entity.message.Notification;

import java.util.List;

/**
 * @author Samuel Butta
 */
public interface NotificationService {

    /**
     * Create new notification
     *
     * @param message text of notification
     */
    public void notify(String message);

    /**
     * Notification is marked as read.
     *
     * @param notification
     */
    public void readNotification(Notification notification);

    /**
     * Delete notification.
     *
     * @param notification
     */
    public void deleteNotification(Notification notification);


    /**
     * @return all notifications with new status
     */
    public List<Notification> findNewNotifications();


    /**
     * @return all notifications with new or read
     */
    public List<Notification> findActiveNotifications();


}
