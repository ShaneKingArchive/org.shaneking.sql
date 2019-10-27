package org.shaneking.sql.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

public class SKTreeIdAdtEntity<J> extends SKIdAdtEntity<J> {
  @Column(columnDefinition = "COMMENT 'Node description'")
  @Getter
  @Setter
  private String nodeDesc;

  @Column(columnDefinition = "COMMENT 'Node name'")
  @Getter
  @Setter
  private String nodeName;

  @Column(columnDefinition = "COMMENT 'Node path, /root/xxx/yyy/zzz/parentId/id/'")
  @Getter
  @Setter
  private String nodePath;

  @Column(length = 1, columnDefinition = "COMMENT 'Node type, Root, Branch or Leaf'")
  @Getter
  @Setter
  private String nodeType;

  @Column(length = 51, columnDefinition = "COMMENT 'Parent identifies'")
  @Getter
  @Setter
  private String parentId;

}