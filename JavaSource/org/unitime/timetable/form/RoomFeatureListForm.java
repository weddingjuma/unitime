/*
 * Licensed to The Apereo Foundation under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 *
 * The Apereo Foundation licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
*/
package org.unitime.timetable.form;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


/** 
* MyEclipse Struts
* Creation date: 02-18-2005
* 
* XDoclet definition:
* @struts:form name="roomFeatureListForm"
*/
/**
 * @author Tomas Muller
 */
public class RoomFeatureListForm extends ActionForm {

	private static final long serialVersionUID = 3256728385592768053L;
	/**
	 * 
	 */
	// --------------------------------------------------------- Instance Variables
	private Collection globalRoomFeatures;
	private Collection departmentRoomFeatures;
	private String deptCode;
	
	// --------------------------------------------------------- Methods

	public String getDeptCodeX() {
		return deptCode;
	}


	public void setDeptCodeX(String deptCode) {
		this.deptCode = deptCode;
	}


	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		globalRoomFeatures = new ArrayList();
		departmentRoomFeatures = new ArrayList();
	}
	
	public Collection getGlobalRoomFeatures() {
		return globalRoomFeatures;
	}
	public void setGlobalRoomFeatures(Collection globalRoomFeatures) {
		this.globalRoomFeatures = globalRoomFeatures;
	}
	public Collection getDepartmentRoomFeatures() {
		return departmentRoomFeatures;
	}
	public void setDepartmentRoomFeatures(Collection departmentRoomFeatures) {
		this.departmentRoomFeatures = departmentRoomFeatures;
	}


	/* (non-Javadoc)
     * @see org.apache.struts.action.ActionForm#validate(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        
        if(deptCode==null || deptCode.equalsIgnoreCase("")) {
        	errors.add("deptCode", 
                    new ActionMessage("errors.required", "Department") );
        }
       
        return errors;
    }
    
}
