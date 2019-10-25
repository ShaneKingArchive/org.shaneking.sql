package org.shaneking.sql.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.shaneking.skava.ling.lang.Integer0;

import javax.persistence.Column;
import javax.persistence.Version;

@Accessors(chain = true)
@ToString(callSuper = true)
public class SKIdAdtVerEntity<J> extends SKIdAdtEntity<J> {

  @Column(nullable = false, columnDefinition = "COMMENT 'Version for optimistic locking'")
  @Getter
  @Setter
  @Version
  private Integer ver;

  public SKIdAdtVerEntity<J> initVer() {
    return this.setVer(Integer0.null2Zero(this.getVer()));
  }

  public SKIdAdtVerEntity<J> initWithUserId(@NonNull String userId) {
    super.initWithUserId(userId);
    return this.initVer();
  }

  public SKIdAdtVerEntity<J> initWithUserIdAndId(@NonNull String userId, @NonNull String id) {
    this.initId(id);
    return this.initWithUserId(userId);
  }
}
