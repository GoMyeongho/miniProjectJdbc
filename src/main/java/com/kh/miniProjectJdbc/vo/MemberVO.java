package com.kh.miniProjectJdbc.vo;


import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {
	private String email;
	private String password;
	private String name;
	private Date date;
}
