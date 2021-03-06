package jp.co.sample.point;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class HomeForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message="Pointが空だぞ")
	@NumberFormat( style = Style.NUMBER)
	@Min(1)
	@Max(100)
	private Integer point;

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

}
// @NotEmpty(message="Pointが空だぞ")
// @Size(min=1, max=10, message="長さは1から10だぞ")
// private String name;
//
// @Email
// private String email
//

