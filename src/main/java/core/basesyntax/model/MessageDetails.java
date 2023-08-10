package core.basesyntax.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class MessageDetails {
  @Id @GeneratedValue private Long id;
  private String sender;
  private LocalDateTime sentTime;
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public LocalDateTime getSentTime() {
    return sentTime;
  }

  public void setSentTime(LocalDateTime sentTime) {
    this.sentTime = sentTime;
  }
}
