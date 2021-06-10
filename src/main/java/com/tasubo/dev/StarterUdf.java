package com.tasubo.dev;

import com.neovisionaries.i18n.CountryCode;
import org.apache.hadoop.hive.ql.exec.UDF;

public class StarterUdf extends UDF {
    public String evaluate(String code) {
        return CountryCode.getByAlpha2Code(code).getAlpha3();
    }
}