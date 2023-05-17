package web.api.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("member")
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    private Long memberId;

    private String name;

    private Integer birth;

}
