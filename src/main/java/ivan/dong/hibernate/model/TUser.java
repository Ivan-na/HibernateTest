package ivan.dong.hibernate.model;

import java.util.Date;


// Generated 2014-9-27 20:57:47 by Hibernate Tools 4.3.1

/**
 * TUser generated by hbm2java
 */
public class TUser implements java.io.Serializable {

	private Integer id;
	private String username;
	private String password;
	private String nickname;
	private Date born;

	public TUser() {
	}

	public TUser(Integer id, String username, String password, String nickname,
			Date born) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.born = born;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Date getBorn() {
		return born;
	}

	public void setBorn(Date born) {
		this.born = born;
	}
}