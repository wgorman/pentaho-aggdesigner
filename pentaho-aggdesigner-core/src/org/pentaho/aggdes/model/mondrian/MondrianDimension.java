/*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with
* the License. You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
*
* Copyright 2006 - 2013 Pentaho Corporation.  All rights reserved.
*/

package org.pentaho.aggdes.model.mondrian;

import java.util.ArrayList;
import java.util.List;

import org.pentaho.aggdes.model.Dimension;

public class MondrianDimension implements Dimension {
  String name;
  List<MondrianHierarchy> hierarchies = new ArrayList<MondrianHierarchy>();
  MondrianDimension(String name) {
      this.name = name;
  }
  
  void addHierarchy(MondrianHierarchy hierarchy) {
      hierarchies.add(hierarchy);
  }
  
  public List<MondrianHierarchy> getHierarchies() {
      return hierarchies;
  }
  
  public String getName() {
      return name;
  }
}
