package com.example.scrapingtest2;

import java.time.LocalDateTime;
import java.util.Objects;

public class NotificationData {
    private final String dataName;
    private final String title;
    private final String subTitle;
    private final LocalDateTime notificationTiming;

    NotificationData(String dataName,String title,String subTitle,LocalDateTime notificationTiming){
        this.dataName=dataName;
        this.title=title;
        this.subTitle=subTitle;
        this.notificationTiming=notificationTiming;
    }
    public String getDataName(){
        return this.dataName;
    }
    public String getTitle(){
        return this.title;
    }
    public String getSubTitle(){
        return this.subTitle;
    }
    public LocalDateTime getNotificationTiming(){
        return this.notificationTiming;
    }
    @Override
    public int hashCode() {
        return Objects.hash(dataName, title, subTitle, notificationTiming);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NotificationData other = (NotificationData) obj;
        return Objects.equals(dataName, other.dataName) &&
                Objects.equals(title, other.title) &&
                Objects.equals(subTitle, other.subTitle) &&
                Objects.equals(notificationTiming, other.notificationTiming);
    }
}
