package com.sint.he.jpaTest.vo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MemberVoTest {
	@Test
	public void getId() {
		final MemberVo memberVo = MemberVo.builder()
				.id("hyungeun")
				.name("he")
				.build();
		final String id = memberVo.getId();
		assertEquals("hyungeun", id);
	}

	@Test
	public void getName() {
		final MemberVo memberVo = MemberVo.builder()
				.id("hyungeun")
				.name("he")
				.build();
		final String name = memberVo.getName();
		assertEquals("he2", name);
	}

}
