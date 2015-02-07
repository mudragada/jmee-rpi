
package util;

import java.util.StringTokenizer;
import java.util.Vector;

public class StringUtils {
    
    public static int numOccurrences(String pString, char pDelimiter) {
	int ret = 0;
        int pos = 0;
	int len = pString.length();
	while (pos < len) {
            int ix = pString.indexOf(pDelimiter, pos);
            if (ix < 0)
                break;
            ++ret;
            pos = ix + 1;
	}
	return ret;
    }
    public static int numOccurrences(String pString, String pDelimiter) {
	int ret = 0;
	int pos = 0;
	int len = pString.length();
	while (pos < len) {
		int ix = pString.indexOf(pDelimiter, pos);
		if (ix < 0)
			break;
		++ret;
		pos = ix + 1;
	}
	return ret;
    } 
    public static String removeCharacters(String iString, String iFilter) {
	int length = iString.length();
	StringBuilder buffer = new StringBuilder(length);
	for (int i = 0; i < length; ++i) {
            char c = iString.charAt(i);
            if (iFilter.indexOf(c) == -1)
		buffer.append(c);
            }
	return buffer.toString();
    }
    public static boolean isAlphaNumOnly(String iString) {
	int length = iString.length();
	for (int i = 0; i < length; ++i) {
            char c = iString.charAt(i);
            if ((c >= 'a') && (c <= 'z'))
		continue;
            if ((c >= 'A') && (c <= 'Z'))
		continue;
            if ((c >= '0') && (c <= '9'))
		continue;
            if ((c == '_') || (c == '-'))
		continue;
            if (c != ' ') {
		return false;
            }
	}
	return true;
    }
    public static Vector tokenizer(String pSrc, String pToken) {
        if (pSrc == null) {
            return null;
        }
        Vector v = null;
        StringTokenizer st = new StringTokenizer(pSrc, pToken);
        while (st.hasMoreTokens()) {
            if (v == null)
                v = new Vector();
            v.addElement(st.nextToken().trim());
	}
        return v;
    }   
}
