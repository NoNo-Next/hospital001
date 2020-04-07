package com.blue.hospital.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 岗位信息
 * 
 * @author
 */
@Data
public class Position implements Serializable {
	/**
	 * 岗位编号
	 */
	private Integer postnumber;

	/**
	 * 岗位名称
	 */
	private String postname;

	/**
	 * 岗位工资
	 */
	private Integer postsalary;

	private Integer isdelete;

	private static final long serialVersionUID = 1L;



	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		Position other = (Position) that;
		return (this.getPostnumber() == null ? other.getPostnumber() == null
				: this.getPostnumber().equals(other.getPostnumber()))
				&& (this.getIsdelete() == null ? other.getIsdelete() == null
						: this.getIsdelete().equals(other.getIsdelete()))
				&& (this.getPostname() == null ? other.getPostname() == null
						: this.getPostname().equals(other.getPostname()))
				&& (this.getPostsalary() == null ? other.getPostsalary() == null
						: this.getPostsalary().equals(other.getPostsalary()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getPostnumber() == null) ? 0 : getPostnumber().hashCode());
		result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
		result = prime * result + ((getPostname() == null) ? 0 : getPostname().hashCode());
		result = prime * result + ((getPostsalary() == null) ? 0 : getPostsalary().hashCode());
		return result;
	}


}