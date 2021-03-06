package com.base.web.bean.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by   on 16-4-21.
 */
public class UpdateMapParam extends UpdateParam<Map<String, Object>> {
    public UpdateMapParam() {
        this(new HashMap<>());
    }

    public UpdateMapParam(Map<String, Object> data) {
        setData(data);
    }

    public UpdateMapParam set(String key, Object value) {
        ((Map<String, Object>) this.getData()).put(key, value);
        return this;
    }

    public static UpdateMapParam build() {
        return new UpdateMapParam();
    }
}
