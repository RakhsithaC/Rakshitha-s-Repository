package boot;

import app4.Brand;
import app4.DuplicateBrand;
import app4.InternationalBrand;
import app4.LocalBrand;
import app4.NationalBrand;
import util.BrandUtil;

public class BrandMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Running MAin.................");
		
		Brand brand=new Brand();
		
		LocalBrand brand2=new LocalBrand();
		
		NationalBrand brand3=new NationalBrand();
		
		DuplicateBrand brand4=new DuplicateBrand();
		
		InternationalBrand brand5=new InternationalBrand();
		
		BrandUtil brandUtil=new BrandUtil();
		System.out.println("Calling run method with Brand ref");
		brandUtil.run(brand);
		System.out.println("-------------------------------");
		
		BrandUtil brandUtil2=new BrandUtil();
		System.out.println("Calling run method with Local Brand ref");
		brandUtil2.run(brand2);
		System.out.println("-------------------------------");
		
		BrandUtil brandUtil3=new BrandUtil();
		System.out.println("Calling run method with National Brand ref");
		brandUtil3.run(brand3);
		System.out.println("-------------------------------");
		
		BrandUtil brandUtil4=new BrandUtil();
		System.out.println("Calling run method with Duplicat Brand ref");
		brandUtil4.run(brand4);
		System.out.println("-------------------------------");
		
		BrandUtil brandUtil5=new BrandUtil();
		System.out.println("Calling run method with INternational Brand ref");
		brandUtil5.run(brand5);
		System.out.println("-------------------------------");

	}

	}

