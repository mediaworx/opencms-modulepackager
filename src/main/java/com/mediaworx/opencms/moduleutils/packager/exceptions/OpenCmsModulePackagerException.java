/*
 * This file is part of the OpenCms Module Packager by mediaworx.
 *
 * For further information about the OpenCms Module Packager, please see 
 * the project website at GitHub: 
 * https://github.com/mediaworx/opencms-modulepackager
 *
 * The OpenCms Module Packager is used by the OpenCms Plugin for IntelliJ. 
 * For further information see the Plugin's project site at GitHub:
 * https://github.com/mediaworx/opencms-intellijplugin
 *  
 * Copyright (C) 2012-2014 mediaworx berlin AG (http://www.mediaworx.com)
 *
 * This program is free software; you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by the 
 * Free Software Foundation; either version 3 of the License, or (at your 
 * option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License 
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along 
 * with this program; if not, write to the Free Software Foundation, Inc., 
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
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
