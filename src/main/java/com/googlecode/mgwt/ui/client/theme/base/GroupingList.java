/*
 * Copyright 2012 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.mgwt.ui.client.theme.base;

import com.google.gwt.resources.client.CssResource;

public interface GroupingList extends CssResource {

	@ClassName("mgwt-GroupingList")
	public String groupingHeaderList();

	@ClassName("mgwt-GroupingList-Moving-Header")
	public String movingHeader();

	@ClassName("mgwt-GroupingList-Selection-Bar")
	public String selectionBar();

	@ClassName("mgwt-GroupingList-Selection-Bar-active")
	public String selectionBarActive();

}