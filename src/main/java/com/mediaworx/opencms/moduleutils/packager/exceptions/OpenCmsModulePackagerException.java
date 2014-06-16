package com.mediaworx.opencms.moduleutils.packager.exceptions;

/**
 * Exception used whenever there's an Error while packaging OpenCms modules
 */
public class OpenCmsModulePackagerException extends Exception {

	/**
	 * Creates a new OpenCmsModulePackagerException
	 * @param s description of the error
	 */
	public OpenCmsModulePackagerException(String s) {
		super(s);
	}

	/**
	 * Creates a new OpenCmsModulePackagerException with a throwable that was causing the exception
	 * @param s description of the error
	 * @param cause the root cause of the Exception
	 */
	public OpenCmsModulePackagerException(String s, Throwable cause) {
		super(s, cause);
	}
}
