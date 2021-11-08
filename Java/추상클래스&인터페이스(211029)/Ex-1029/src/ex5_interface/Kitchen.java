package ex5_interface;

public class Kitchen implements Menu3 {

	@Override
	public String jjajang() {

		return "Áß¸é + ÃáÀå¼Ò½º";
	}

	@Override
	public String jjambbong() {

		return "È«ÇÕ + ¿ÀÂ¡¾î";
	}

	@Override
	public String tangsuyuck() {
		
		return "µÅÁö°í±â + ÅÁ¼öÀ° ¼Ò½º";
	}

	@Override
	public String boggembab() {

		return "ÀÌÃµ½Ò + °¢Á¾¾ßÃ¤";
	}

}
