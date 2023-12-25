/*
 *
 *   Licensed to the Apache Software Foundation (ASF) under one or more
 *   contributor license agreements.  See the NOTICE file distributed with
 *   this work for additional information regarding copyright ownership.
 *   The ASF licenses this file to You under the Apache License, Version 2.0
 *   (the "License"); you may not use this file except in compliance with
 *   the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package org.apache.dubbo.rest.withtoken.consumer.test;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.samples.rest.withtoken.api.DemoService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConsumerTest {
    @DubboReference
    private DemoService demoService;

    @Test
    public void test01(){
        try {
            String hello = demoService.hello("1111");
            System.out.println(hello);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    @Test
//    public void http() {
//        OkHttpClient CLIENT = new OkHttpClient().
//                newBuilder().readTimeout(60, TimeUnit.SECONDS).build();
//        Request.Builder builder = new Request.Builder();
//        // 添加header
//        builder.addHeader(RestHeaderEnum.TOKEN_KEY.getHeader(), "122");
//        Request request = builder.url("http://127.0.0.1:8087").build();
//        try (Response response = CLIENT.newCall(request).execute()) {
//            if (!response.isSuccessful()) {
//                throw new RuntimeException("Unexpected code " + response);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
