/*
 * Copyright ${licenseYear} (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package server.hr;

import example.xmlschema.Hr;
import example.xmlschema.Person;

/**
 * Created by Jean-Philippe Belanger on 11/11/16. Just potential zeroes and ones
 */
public class HrImpl implements Hr {


  @Override
  public GetHrResponse getHr() {
    Person p = new Person();
    p.setName("Foo");
    Person.Address addr = new Person.Address();
    addr.setPostCode("HFOF");

    p.setAddress(addr);
    return GetHrResponse.respond200WithApplicationXml(p);
  }

  @Override
  public void putHr(Person entity) {}

}