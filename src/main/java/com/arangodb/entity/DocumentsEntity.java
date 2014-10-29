/*
 * Copyright (C) 2012 tamtam180
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.arangodb.entity;

import java.util.Iterator;
import java.util.List;

import com.arangodb.util.CollectionUtils;

/**
 * @author tamtam180 - kirscheless at gmail.com
 *
 */
public class DocumentsEntity extends BaseEntity implements Iterable<String> {

  List<String> documents;

  public Iterator<String> iterator() {
    return CollectionUtils.safetyIterator(documents);
  }

  public List<String> getDocuments() {
    return documents;
  }

  public void setDocuments(List<String> documents) {
    this.documents = documents;
  }
  
}
