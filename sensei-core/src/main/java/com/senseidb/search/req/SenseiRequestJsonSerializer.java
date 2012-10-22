package com.senseidb.search.req;


import com.linkedin.norbert.network.Serializer;


public class SenseiRequestJsonSerializer implements Serializer<SenseiRequest, SenseiResult>
{
  public String requestName() {
    return "FastJsonSenseiRequest";
  }

  public String responseName() {
    return "FastJsonSenseiResult";
  }

  public byte[] requestToBytes(SenseiRequest request) {
    return com.alibaba.fastjson.JSON.toJSONBytes(request);
  }

  public byte[] responseToBytes(SenseiResult response) {
    return com.alibaba.fastjson.JSON.toJSONBytes(response);
  }

  public SenseiRequest requestFromBytes(byte[] request) {
    return com.alibaba.fastjson.JSON.parseObject(request, SenseiRequest.class);
  }

  public SenseiResult responseFromBytes(byte[] result) {
    return com.alibaba.fastjson.JSON.parseObject(result, SenseiResult.class);
  }
}
