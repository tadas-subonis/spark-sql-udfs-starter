package com.tasubo.dev;

import com.neovisionaries.i18n.CountryCode;
import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;

public class StarterGenericUdf extends GenericUDF {
    public String evaluate(String code) {
        return CountryCode.getByAlpha2Code(code).getAlpha3();
    }

    @Override
    public ObjectInspector initialize(ObjectInspector[] arguments) throws UDFArgumentException {
        return null;
    }

    @Override
    public Object evaluate(DeferredObject[] arguments) throws HiveException {
        return CountryCode.getByAlpha2Code(arguments[0].get().toString()).getAlpha3();
    }

    @Override
    public String getDisplayString(String[] children) {
        return null;
    }
}