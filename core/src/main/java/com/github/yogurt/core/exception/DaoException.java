package com.github.yogurt.core.exception;

/**
 * Created by IntelliJ IDEA.
 * Date: 12-12-5 Time: 上午10:46 Dao层异常
 *
 * @author jtwu
 */
public class DaoException extends BaseErrorException {
	private static final long serialVersionUID = 7799029148591208607L;

	public DaoException() {
		super();
	}

	public DaoException(String message) {
		super(message);
	}

	public DaoException(Throwable cause) {
		super(cause.getMessage(), cause);
	}

	public DaoException(String message, Throwable cause) {
		super(message, cause);
	}


}
