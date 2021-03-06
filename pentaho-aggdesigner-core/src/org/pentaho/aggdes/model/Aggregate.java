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

package org.pentaho.aggdes.model;

import java.util.List;


/**
 * Aggregate, also known as an aggregate table, or summary table.
 * Generated by the algorithm.
 */
public interface Aggregate {

    /**
     * Returns a suggestion for the name of a table in which to store this 
     * aggregate.
     *
     * <p>The suggestion does not need to be unique within the db schema or
     * less than the database's table name limit, but the implementation should
     * try to generate a name that is likely to be unique and descriptive in
     * the first 20 or so characters.
     *
     * @return candidate table name
     */
    String getCandidateTableName();
    
    /**
     * Returns a text description of this aggregate
     * 
     * @return description of aggregate
     */
    public String getDescription();
    
    /**
     * Returns a list of attributes in this aggregate table.
     *
     * @return list of attributes in this aggregate table
     */
    List<Attribute> getAttributes();

    /**
     * Returns a list of measures in this aggregate table.
     *
     * @return list of measures in this aggregate table
     */
    List<Measure> getMeasures();

    /**
     * Returns an estimate of the number of distinct values in this
     * Aggregate.
     *
     * @return estimated number of distinct values
     */
    double estimateRowCount();

    /**
     * Returns an estimate of the amount of space (in bytes) required to
     * store this Aggregate.
     *
     * @return estimated space in bytes
     */
    double estimateSpace();
}

// End Aggregate.java
