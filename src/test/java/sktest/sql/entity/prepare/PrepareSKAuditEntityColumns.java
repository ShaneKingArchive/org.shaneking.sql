package sktest.sql.entity.prepare;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Table;

@Accessors(chain = true)
@Table(name = "t_prepare_s_k_audit_entity_columns", schema = "testschema")
@ToString(callSuper = true)
public class PrepareSKAuditEntityColumns extends PrepareSKAuditEntityIdVersion {
  @Getter
  @Setter
  private String withoutAnnotation;

  @Column(length = 10)
  @Getter
  @Setter
  private String hasLength;

  @Column(name = "re_name", length = 4000)
  @Getter
  @Setter
  private String reName;
}
