package com.abc.planyourtrip.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.abc.planyourtrip.model.Package;

@Service
public class PackageService {
	private static List<Package> packageList = new ArrayList<Package>();
//	private static int packageCount = 1;

	static {
		packageList.add(new Package(1,"hydHotSpots","Hyderabad","Watch all hyderabad hot spot locations",7,10000));
		packageList.add(new Package(2,"banHotSpots","Bangalore","Watch all bangalore hot spot locations",10,20000));
		packageList.add(new Package(3,"hydHotSpots2","Hyderabad","Watch all hyderabad hot spot locations",3,6000));
		packageList.add(new Package(4,"DelHotSpots","Delhi","Watch all delhi hot spot locations",7,15000));
		packageList.add(new Package(5,"DelHotSpots2","Delhi","Watch all delhi hot spot locations",5,12000));
		packageList.add(new Package(6,"MumHotSpots2","Mumbai","Watch all mumbai hot spot locations",9,20000));
		packageList.add(new Package(7,"MumHotSpots","Mumbai","Watch all mumbai hot spot locations",2,6000));
		packageList.add(new Package(8,"hydHotSpots3","Hyderabad","Watch all hyderabad hot spot locations",5,9000));
		packageList.add(new Package(9,"banHotSpots2","Bangalore","Watch all bangalore hot spot locations",4,8000));
	
	}

	
	public boolean validateLocation(String targetLoc) {
		for(Package pack : packageList) {
			if(pack.getPackageLocation().equalsIgnoreCase(targetLoc))
				return true;
		}
		
		return false;
	}
	
	public List<Package> retrievePackages(String targetLoc) {
		List<Package> filteredPackages = new ArrayList<Package>();
		for (Package pack : packageList) {
			if (pack.getPackageLocation().equals(targetLoc)) {
				filteredPackages.add(pack);
			}
		}
		return filteredPackages;
	}

}
