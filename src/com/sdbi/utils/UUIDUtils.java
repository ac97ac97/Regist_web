package com.sdbi.utils;

import java.util.UUID;

/**
 * ��������ַ���������
 * 
 * @author ����
 *
 */

public class UUIDUtils {

	public static String getUUID() {
        return UUID.randomUUID().toString().replace("-","");
	}
}
