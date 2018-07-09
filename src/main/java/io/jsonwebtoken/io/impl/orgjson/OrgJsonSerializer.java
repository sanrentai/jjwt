package io.jsonwebtoken.io.impl.orgjson;

import io.jsonwebtoken.io.SerializationException;
import io.jsonwebtoken.io.Serializer;
import io.jsonwebtoken.lang.Assert;

import java.util.Map;

public class OrgJsonSerializer<T> implements Serializer<T> {

    public OrgJsonSerializer(){}

    @Override
    public byte[] serialize(T t) throws SerializationException {
        Assert.isInstanceOf(Map.class, t, "This implementation currently only supports Map instances.");
        Map m = (Map)t;
        return new byte[0];
    }
}
