/**
 * Copyright (c) 2014 mediaworx berlin AG (http://mediaworx.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about mediaworx berlin AG, please see the
 * company website: http://mediaworx.com
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 * If not, see <http://www.gnu.org/licenses/>
 */

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
