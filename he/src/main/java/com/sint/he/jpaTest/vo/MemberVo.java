package com.sint.he.jpaTest.vo;

import lombok.*;
import javax.persistence.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "member")
public class MemberVo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long mbrNo;
	private String id;
	private String name;

	@Builder
	public MemberVo(String id, String name) {
		this.id = id;
		this.name = name;
	}
}
