package com.senseidb.search.req;


import com.linkedin.norbert.network.Serializer;


public class SenseiSysRequestJsonSerializer implements Serializer<SenseiRequest, SenseiSystemInfo>
{
  public String requestName() {
    return "FastJsonSenseiSysRequest";
  }

  public String responseName() {
    return "FastJsonSenseiSystemInfo";
  }

  public byte[] requestToBytes(SenseiRequest request) {
    return com.alibaba.fastjson.JSON.toJSONBytes(request);
  }

  public byte[] responseToBytes(SenseiSystemInfo response) {
    return com.alibaba.fastjson.JSON.toJSONBytes(response);
  }

  public SenseiRequest requestFromBytes(byte[] request) {
    return com.alibaba.fastjson.JSON.parseObject(request, SenseiRequest.class);
  }

  public SenseiSystemInfo responseFromBytes(byte[] result) {
    return com.alibaba.fastjson.JSON.parseObject(result, SenseiSystemInfo.class);
  }
}
