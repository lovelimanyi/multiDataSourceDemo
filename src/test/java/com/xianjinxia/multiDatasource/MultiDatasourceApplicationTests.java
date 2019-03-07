package com.xianjinxia.multiDatasource;

import com.xianjinxia.multiDatasource.back.test.domain.UserPermission;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultiDatasourceApplicationTests {

	String[] promotionThirdExcelFields = { "日期", "商户名称", "渠道名称","渠道id", "注册人数", "首次申请人数", "首次放款人数"};
	String[] promotionThirdExcelEieldKeys = {"dt", "merchantNumber", "channelName","channelOrgId", "regCount", "applyCount","loanSuccCount"};

	@Test
	public void contextLoads() {

		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");

		list.remove(2);
	}




	@Test
	public void test2(){

		System.out.println("111111");
		String str = String.valueOf(null);

		System.out.println("222222");

	}


	public static boolean isNumber(String str){
		Pattern pattern = Pattern.compile("[0-9]*");
		Matcher isNum = pattern.matcher(str);
		return isNum.matches();
	}



	@Test
	public void test3(){

		System.out.println("111111");

		String str = "545455";
		String str2 = "5645645sdfdsf";
		boolean re = isNumber(str);
		boolean re2 = isNumber(str2);

		System.out.println("222222");

	}

	//根据权限，设置显示对应列
	private void setUserPermissionExcelFields() {
//		Long userId = userInfoUtils.getUserInfo().getUserId();
//		UserPermission userPermission = userinfoMapper.getUserPermission(userId);
		UserPermission userPermission = new UserPermission();
		userPermission.setRegisterPermission(0);
		userPermission.setApplyPermission(0);
		userPermission.setLoanPermission(0);
		if ("0".equals(String.valueOf(userPermission.getRegisterPermission()))){
			List<String> fieldsList = new ArrayList<>();
			List<String> fieldKeys = new ArrayList<>();
			for(int i=0;i<promotionThirdExcelFields.length;i++){
				fieldsList.add(promotionThirdExcelFields[i]);
				fieldKeys.add(promotionThirdExcelEieldKeys[i]);
			}
			fieldsList.remove(4);
			fieldKeys.remove(4);

			promotionThirdExcelFields = new String[fieldsList.size()];
			fieldsList.toArray(promotionThirdExcelFields);
			promotionThirdExcelEieldKeys = new String[fieldsList.size()];
			fieldsList.toArray(promotionThirdExcelEieldKeys);
		}
		if ("0".equals(String.valueOf(userPermission.getApplyPermission()))){
			List<String> fieldsList = new ArrayList<>();
			List<String> fieldKeys = new ArrayList<>();
			for(int i=0;i<promotionThirdExcelFields.length;i++){
				fieldsList.add(promotionThirdExcelFields[i]);
				fieldKeys.add(promotionThirdExcelEieldKeys[i]);
			}
			fieldsList.remove(5);
			fieldKeys.remove(5);

			promotionThirdExcelFields = new String[fieldsList.size()];
			fieldsList.toArray(promotionThirdExcelFields);
			promotionThirdExcelEieldKeys = new String[fieldsList.size()];
			fieldsList.toArray(promotionThirdExcelEieldKeys);
		}
		if ("0".equals(String.valueOf(userPermission.getLoanPermission()))){
			List<String> fieldsList = new ArrayList<>();
			List<String> fieldKeys = new ArrayList<>();
			for(int i=0;i<promotionThirdExcelFields.length;i++){
				fieldsList.add(promotionThirdExcelFields[i]);
				fieldKeys.add(promotionThirdExcelEieldKeys[i]);
			}
			fieldsList.remove(6);
			fieldKeys.remove(6);

			promotionThirdExcelFields = new String[fieldsList.size()];
			fieldsList.toArray(promotionThirdExcelFields);
			promotionThirdExcelEieldKeys = new String[fieldsList.size()];
			fieldsList.toArray(promotionThirdExcelEieldKeys);
		}
	}

}
