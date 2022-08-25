package atm.atm.utils;

import org.apache.commons.lang3.StringUtils;

public class ContaUtils {

    public static String getSomenteNumeros(String value) {

        if (StringUtils.isNotBlank(value)) {
            return value.replaceAll("[^0-9]", "");
        }

        return "";
    }
}
