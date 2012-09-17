/**
 * This software is licensed to you under the Apache License, Version 2.0 (the
 * "Apache License").
 *
 * LinkedIn's contributions are made under the Apache License. If you contribute
 * to the Software, the contributions will be deemed to have been made under the
 * Apache License, unless you expressly indicate otherwise. Please do not make any
 * contributions that would be inconsistent with the Apache License.
 *
 * You may obtain a copy of the Apache License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, this software
 * distributed under the Apache License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the Apache
 * License for the specific language governing permissions and limitations for the
 * software governed under the Apache License.
 *
 * © 2012 LinkedIn Corp. All Rights Reserved.  
 */
package com.senseidb.search.node.broker;

import java.util.List;

import com.senseidb.search.req.SenseiRequest;

public interface LayeredClusterPruner {
  public List<String> pruneClusters(SenseiRequest request, List<String> clusters);
  /**
   * Returns true if documents in one cluster have not a greater priority(comparison value) than documents in another one. 
   * In this case the broker will treat each cluster as just another partition
   * By default this method should return false
   * @param request
   * @return
   */
  public boolean clusterPrioritiesEqual(SenseiRequest request);
}
