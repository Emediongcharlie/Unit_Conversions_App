package com.Mathematical.Perfect_unit_conversions.sevices;

import com.Mathematical.Perfect_unit_conversions.dtos.request.*;
import com.Mathematical.Perfect_unit_conversions.dtos.response.*;
import com.Mathematical.Perfect_unit_conversions.models.Conversions;
import com.Mathematical.Perfect_unit_conversions.models.Symbol;
import com.Mathematical.Perfect_unit_conversions.repositories.ConversionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;

@Service
public class ConversionServiceImpl implements ConversionService{

    @Autowired
    private ConversionRepository conversionRepository;

    @Override
    public CalculateLengthResponse calculateLength(CalculateLengthRequest calculateLengthRequest) {

        Conversions conversions = new Conversions();
        conversions.setEntryValue(calculateLengthRequest.getEntryValue());
        conversions.setConvertFrom(calculateLengthRequest.getConvertFrom());
        conversions.setConvertTo(calculateLengthRequest.getConvertTo());

        double convertedValue = 0.0;

        if (conversions.getConvertFrom() != null && conversions.getConvertTo() != null) {
            String from = conversions.getConvertFrom().toLowerCase();
            String to = conversions.getConvertTo().toLowerCase();

            if (from.equals("mm") && to.equals("cm")) {
                convertedValue = conversions.getEntryValue() / 10.0;
//                conversionRepository.save(conversions);;;;;[
            }
            if(from.equals("mm") && to.equals("dm")) {
                convertedValue = conversions.getEntryValue() / 100.0;
            }
            if(from.equals("mm") && to.equals("m")) {
                convertedValue = conversions.getEntryValue() / 1000.0;
            }if(from.equals("mm") && to.equals("dam")) {
                convertedValue = conversions.getEntryValue() / 10000;
            }
            if(from.equals("mm") && to.equals("hm")) {
                convertedValue = conversions.getEntryValue() / 100000;
            }
            if(from.equals("mm") && to.equals("km")) {
                convertedValue = conversions.getEntryValue() / 1000000.0;
            }
            if(from.equals("mm") && to.equals("feet")) {
                convertedValue = conversions.getEntryValue() / 304.8;
            }
            if(from.equals("mm") && to.equals("inch")) {
                convertedValue = conversions.getEntryValue() / 25.4;
            }
            if(from.equals("mm") && to.equals("yard")) {
                convertedValue = conversions.getEntryValue() / 914.4;
            }
            if(from.equals("mm") && to.equals("miles")) {
                convertedValue = conversions.getEntryValue() / 1609344;
            }
            if (from.equals("cm") && to.equals("mm")) {
                convertedValue = conversions.getEntryValue() * 10.0;
            }
            if(from.equals("dm") && to.equals("mm")) {
                convertedValue = conversions.getEntryValue() * 100.0;
            }
            if(from.equals("m") && to.equals("mm")) {
                convertedValue = conversions.getEntryValue() * 1000.0;
            }if(from.equals("dam") && to.equals("mm")) {
                convertedValue = conversions.getEntryValue() * 10000;
            }
            if(from.equals("hm") && to.equals("mm")) {
                convertedValue = conversions.getEntryValue() * 100000;
            }
            if(from.equals("km") && to.equals("mm")) {
                convertedValue = conversions.getEntryValue() * 1000000.0;
            }
            if(from.equals("feet") && to.equals("mm")) {
                convertedValue = conversions.getEntryValue() * 304.8;
            }
            if(from.equals("inch") && to.equals("mm")) {
                convertedValue = conversions.getEntryValue() * 25.4;
            }
            if(from.equals("yard") && to.equals("mm")) {
                convertedValue = conversions.getEntryValue() * 914.4;
            }
            if(from.equals("miles") && to.equals("mm")) {
                convertedValue = conversions.getEntryValue() * 1609344;
            }


            if(from.equals("cm") && to.equals("dm")) {
                convertedValue = conversions.getEntryValue() / 10;
            }
            if(from.equals("cm") && to.equals("m")) {
                convertedValue = conversions.getEntryValue() / 100.0;
            }
            if(from.equals("cm") && to.equals("dam")) {
                convertedValue = conversions.getEntryValue() / 1000;
            }
            if(from.equals("cm") && to.equals("hm")) {
                convertedValue = conversions.getEntryValue() / 10000;
            }
            if(from.equals("cm") && to.equals("km")) {
                convertedValue = conversions.getEntryValue() / 100000;
            }
            if(from.equals("cm") && to.equals("feet")) {
                convertedValue = conversions.getEntryValue() / 30.48;
            }
            if(from.equals("cm") && to.equals("inch")) {
                convertedValue = conversions.getEntryValue() / 2.54;
            }
            if(from.equals("cm") && to.equals("yard")) {
                convertedValue = conversions.getEntryValue() / 91.44;
            }
            if(from.equals("cm") && to.equals("miles")) {
                convertedValue = conversions.getEntryValue() / 160934.4;
            }
            if(from.equals("dm") && to.equals("cm")) {
                convertedValue = conversions.getEntryValue() * 10;
            }
            if(from.equals("m") && to.equals("cm")) {
                convertedValue = conversions.getEntryValue() * 100.0;
            }
            if(from.equals("dam") && to.equals("cm")) {
                convertedValue = conversions.getEntryValue() * 1000;
            }
            if(from.equals("hm") && to.equals("cm")) {
                convertedValue = conversions.getEntryValue() * 10000;
            }
            if(from.equals("km") && to.equals("cm")) {
                convertedValue = conversions.getEntryValue() * 100000;
            }
            if(from.equals("feet") && to.equals("cm")) {
                convertedValue = conversions.getEntryValue() * 30.48;
            }
            if(from.equals("inch") && to.equals("cm")) {
                convertedValue = conversions.getEntryValue() * 2.54;
            }
            if(from.equals("yard") && to.equals("cm")) {
                convertedValue = conversions.getEntryValue() * 91.44;
            }
            if(from.equals("miles") && to.equals("cm")) {
                convertedValue = conversions.getEntryValue() * 160934.4;
            }


            if(from.equals("m") && to.equals("dm")) {
                convertedValue = conversions.getEntryValue() * 10;
            }
            if(from.equals("m") && to.equals("dam")) {
                convertedValue = conversions.getEntryValue() / 10;
            }
            if(from.equals("m") && to.equals("hm")) {
                convertedValue = conversions.getEntryValue() / 100;
            }
            if(from.equals("m") && to.equals("km")) {
                convertedValue = conversions.getEntryValue() / 1000;
            }
            if(from.equals("m") && to.equals("feet")) {
                convertedValue = conversions.getEntryValue() * 3.28084;
            }
            if(from.equals("m") && to.equals("inch")) {
                convertedValue = conversions.getEntryValue() * 39.37;
            }
            if(from.equals("m") && to.equals("yard")) {
                convertedValue = conversions.getEntryValue() * 1.09361;
            }
            if(from.equals("m") && to.equals("miles")) {
                convertedValue = conversions.getEntryValue() / 1609;
            }
            if(from.equals("dm") && to.equals("m")) {
                convertedValue = conversions.getEntryValue() / 10;
            }
            if(from.equals("dam") && to.equals("m")) {
                convertedValue = conversions.getEntryValue() * 100;
            }
            if(from.equals("hm") && to.equals("m")) {
                convertedValue = conversions.getEntryValue() * 1000;
            }
            if(from.equals("km") && to.equals("m")) {
                convertedValue = conversions.getEntryValue() * 1000;
            }
            if(from.equals("feet") && to.equals("m")) {
                convertedValue = conversions.getEntryValue() / 3.28084;
            }
            if(from.equals("inch") && to.equals("m")) {
                convertedValue = conversions.getEntryValue() / 39.37;
            }
            if(from.equals("yard") && to.equals("m")) {
                convertedValue = conversions.getEntryValue() / 1.09361;
            }
            if(from.equals("miles") && to.equals("m")) {
                convertedValue = conversions.getEntryValue() * 1609;
            }


            if(from.equals("km") && to.equals("dm")) {
                convertedValue = conversions.getEntryValue() * 10000;
            }
            if(from.equals("km") && to.equals("dam")) {
                convertedValue = conversions.getEntryValue() * 100;
            }
            if(from.equals("km") && to.equals("hm")) {
                convertedValue = conversions.getEntryValue() * 10;
            }
            if(from.equals("km") && to.equals("feet")) {
                convertedValue = conversions.getEntryValue() * 3280.84;
            }
            if(from.equals("km") && to.equals("inch")) {
                convertedValue = conversions.getEntryValue() * 39370.1;
            }
            if(from.equals("km") && to.equals("yard")) {
                convertedValue = conversions.getEntryValue() * 1093.61;
            }
            if(from.equals("km") && to.equals("miles")) {
                convertedValue = conversions.getEntryValue() * 0.621371;
            }
            if(from.equals("dm") && to.equals("km")) {
                convertedValue = conversions.getEntryValue() / 10000;
            }
            if(from.equals("dam") && to.equals("km")) {
                convertedValue = conversions.getEntryValue() / 100;
            }
            if(from.equals("hm") && to.equals("km")) {
                convertedValue = conversions.getEntryValue() / 10;
            }
            if(from.equals("feet") && to.equals("km")) {
                convertedValue = conversions.getEntryValue() / 3280.84;
            }
            if(from.equals("inch") && to.equals("km")) {
                convertedValue = conversions.getEntryValue() / 39370.1;
            }
            if(from.equals("yard") && to.equals("km")) {
                convertedValue = conversions.getEntryValue() / 1093.61;
            }
            if(from.equals("miles") && to.equals("km")) {
                convertedValue = conversions.getEntryValue() / 0.621371;
            }
            else{
                throw new IllegalArgumentException("Invalid conversion pair");
            }
            conversions.setResult(convertedValue);
            conversionRepository.save(conversions);

    }

        CalculateLengthResponse response = new CalculateLengthResponse();
        response.setConvertedValue(convertedValue);
        response.setConvertFrom(conversions.getConvertFrom());
        response.setConvertTo(conversions.getConvertTo());
        response.setEntryValue(conversions.getEntryValue());
        response.setResult(convertedValue);

        return response;

    }

//    public CalculateLengthResponse calculateLength(CalculateLengthRequest calculateLengthRequest) {
//        Conversions conversions = new Conversions();
//        conversions.setEntryValue(calculateLengthRequest.getEntryValue());
//        conversions.setConvertFrom(calculateLengthRequest.getConvertFrom());
//        conversions.setConvertTo(calculateLengthRequest.getConvertTo());
//
//        double convertedValue = 0.0;
//
//        if (conversions.getConvertFrom() != null && conversions.getConvertTo() != null) {
//            String from = conversions.getConvertFrom().toLowerCase();
//            String to = conversions.getConvertTo().toLowerCase();
//
//            // Map of conversion factors
//            Map<String, Double> conversionFactors = new HashMap<>();
//            conversionFactors.put("mm_cm", 0.1);
//            conversionFactors.put("mm_dm", 0.01);
//            conversionFactors.put("mm_m", 0.001);
//            conversionFactors.put("mm_dam", 0.0001);
//            conversionFactors.put("mm_hm", 0.00001);
//            conversionFactors.put("mm_km", 0.000001);
//            conversionFactors.put("mm_feet", 0.00328084);
//            conversionFactors.put("mm_inch", 0.0393701);
//            conversionFactors.put("mm_yard", 0.00109361);
//            conversionFactors.put("mm_miles", 0.000000621371);
//
//            conversionFactors.put("km_m", 1000.0);
//            conversionFactors.put("km_dm", 10000.0);
//            conversionFactors.put("km_cm", 100000.0);
//            conversionFactors.put("km_mm", 1000000.0);
//            conversionFactors.put("km_feet", 3280.84);
//            conversionFactors.put("km_inch", 39370.1);
//            conversionFactors.put("km_yard", 1093.61);
//            conversionFactors.put("km_miles", 0.621371);
//
//            conversionFactors.put("m_km", 0.001);
//            conversionFactors.put("m_dm", 10.0);
//            conversionFactors.put("m_cm", 100.0);
//            conversionFactors.put("m_mm", 1000.0);
//            conversionFactors.put("m_feet", 3.28084);
//            conversionFactors.put("m_inch", 39.37);
//            conversionFactors.put("m_yard", 1.09361);
//            conversionFactors.put("m_miles", 0.000621371);
//
//            conversionFactors.put("yard_km", 0.0009144);
//            conversionFactors.put("yard_m", 0.9144);
//            conversionFactors.put("yard_cm", 91.44);
//            conversionFactors.put("yard_mm", 914.4);
//            conversionFactors.put("yard_feet", 3.0);
//            conversionFactors.put("yard_inch", 36.0);
//            conversionFactors.put("yard_miles", 0.000568182);
//
//            // Form key
//            String key = from + "_" + to;
//
//            if (conversionFactors.containsKey(key)) {
//                convertedValue = conversions.getEntryValue() * conversionFactors.get(key);
//            } else {
//                throw new IllegalArgumentException("Invalid conversion pair: " + from + " to " + to);
//            }
//
//            // Save valid conversion
//            conversions.setResult(convertedValue);
//            conversionRepository.save(conversions);
//        }
//
//        // Build response
//        CalculateLengthResponse response = new CalculateLengthResponse();
//        response.setConvertedValue(convertedValue);
//        response.setConvertFrom(conversions.getConvertFrom());
//        response.setConvertTo(conversions.getConvertTo());
//        response.setEntryValue(conversions.getEntryValue());
//        response.setResult(convertedValue);
//
//        return response;
//    }

    @Override
    public CalculateAreaResponse calculateArea(CalculateAreaRequest calculateAreaRequest) {
        Conversions conversions =  new Conversions();
        conversions.setConvertFrom(calculateAreaRequest.getConvertFrom());
        conversions.setConvertTo(calculateAreaRequest.getConvertTo());
        conversions.setEntryValue(calculateAreaRequest.getEntryValue());

        double convertedValue = 0.0;

        if (conversions.getConvertFrom() != null && conversions.getConvertTo() != null) {
            String from = conversions.getConvertFrom().toLowerCase();
            String to = conversions.getConvertTo().toLowerCase();

            Map<String, Double> conversionFactor = new HashMap<>();

            conversionFactor.put("mm²_m²", 0.001);
            conversionFactor.put("cm²_m²", 0.01);
            conversionFactor.put("dm²_m²", 0.1);
            conversionFactor.put("dam²_m²", 100.0);
            conversionFactor.put("hm²_m²", 10000.0);
            conversionFactor.put("km²_m²", 1000000.0);

            conversionFactor.put("mm²_mm²", 1.0);
            conversionFactor.put("mm²_cm²", 0.01);
            conversionFactor.put("mm²_dm²", 0.01);
            conversionFactor.put("mm²_dam²", 0.00001);
            conversionFactor.put("mm²_hm²", 0.0000001);
            conversionFactor.put("mm²_km²", 0.000000001);

            conversionFactor.put("cm²_mm²", 100.0);
            conversionFactor.put("dm²_mm²", 100.0);
            conversionFactor.put("dam²_mm²", 100000.0);
            conversionFactor.put("hm²_mm²", 10000000.0);
            conversionFactor.put("km²_mm²", 1000000000.0);

            conversionFactor.put("m²_mm²", 1000.0);
            conversionFactor.put("m²_cm²", 100.0);
            conversionFactor.put("m²_dm²", 10.0);
            conversionFactor.put("m²_dam²", 0.01);
            conversionFactor.put("m²_hm²", 0.0001);
            conversionFactor.put("m²_km²", 0.000001);


            conversionFactor.put("dm²_cm²", 10.0);
            conversionFactor.put("dam²_cm²", 10000.0);
            conversionFactor.put("hm²_cm²", 1000000.0);
            conversionFactor.put("km²_cm²", 100000000.0);

            conversionFactor.put("cm²_cm²", 1.0);
            conversionFactor.put("cm²_dm²", 0.1);
            conversionFactor.put("cm²_dam²", 0.0001);
            conversionFactor.put("cm²_hm²", 0.000001);
            conversionFactor.put("cm²_km²", 0.00000001);

            conversionFactor.put("dm²_dm²", 1.0);
            conversionFactor.put("dam²_dm²", 100.0);
            conversionFactor.put("hm²_dm²", 10000.0);
            conversionFactor.put("km²_dm²", 1000000.0);

            conversionFactor.put("dm²_dam²", 0.01);
            conversionFactor.put("dm²_hm²", 0.0001);
            conversionFactor.put("dm²_km²", 0.000001);

            conversionFactor.put("dam²_km²", 0.0001);
            conversionFactor.put("hm²_km²", 0.01);
            conversionFactor.put("km²_km²", 1.0);

            conversionFactor.put("km²_dam²", 10000.0);
            conversionFactor.put("km²_hm²", 100.0);


            String key = from + "_" + to;
            if(conversionFactor.containsKey(key)) {
                convertedValue = conversions.getEntryValue() * conversionFactor.get(key);
            }else{
                throw new IllegalArgumentException("Invalid conversion pair");
            }

            conversions.setResult(convertedValue);
            conversionRepository.save(conversions);

        }
        CalculateAreaResponse response = new CalculateAreaResponse();
        response.setConvertFrom(conversions.getConvertFrom());
        response.setConvertTo(conversions.getConvertTo());
        response.setEntryValue(conversions.getEntryValue());
        response.setResult(convertedValue);
        return response;
    }

    @Override
    public CalculateVolumeResponse calculateVolume(CalculateVolumeRequest calculateVolumeRequest) {
        Conversions conversions = new Conversions();
        conversions.setConvertFrom(calculateVolumeRequest.getConvertFrom());
        conversions.setConvertTo(calculateVolumeRequest.getConvertTo());
        conversions.setEntryValue(calculateVolumeRequest.getEntryValue());

        double convertedValue = 0.00;

        if(conversions.getConvertFrom() != null && conversions.getConvertTo() != null) {
            String from = conversions.getConvertFrom().toLowerCase();
            String to = conversions.getConvertTo().toLowerCase();

            Map<String, Double> conversionFactor = new HashMap<>();

            conversionFactor.put("ml_cl", 0.1);
            conversionFactor.put("ml_dl", 0.01);
            conversionFactor.put("ml_l", 0.001);
            conversionFactor.put("ml_dal", 0.0001);
            conversionFactor.put("ml_hl", 0.00001);
            conversionFactor.put("ml_kl", 0.000001);

            conversionFactor.put("cl_ml", 10.0);
            conversionFactor.put("dl_ml", 100.0);
            conversionFactor.put("l_ml", 1000.0);
            conversionFactor.put("dal_ml", 10000.0);
            conversionFactor.put("hl_ml", 100000.0);
            conversionFactor.put("kl_ml", 1000000.0);

            conversionFactor.put("l_cl", 100.0);
            conversionFactor.put("dal_cl", 1000.0);
            conversionFactor.put("hl_cl", 10000.0);
            conversionFactor.put("kl_cl", 100000.0);

            conversionFactor.put("cl_dl", 0.1);
            conversionFactor.put("cl_l", 0.01);
            conversionFactor.put("cl_dal", 0.001);
            conversionFactor.put("cl_hl", 0.0001);
            conversionFactor.put("cl_kl", 0.00001);

            conversionFactor.put("l_dl", 10.0);
            conversionFactor.put("l_dal", 0.1);
            conversionFactor.put("l_hl", 0.01);
            conversionFactor.put("l_kl", 0.001);

            conversionFactor.put("dl_l", 0.1);
            conversionFactor.put("l_l", 1.0);
            conversionFactor.put("dal_l", 10.0);
            conversionFactor.put("hl_l", 100.0);
            conversionFactor.put("kl_l", 1000.0);

            conversionFactor.put("dl_kl", 0.0001);
            conversionFactor.put("dal_kl", 0.01);
            conversionFactor.put("hl_kl", 0.1);
            conversionFactor.put("kl_kl", 0.1);

            conversionFactor.put("kl_dl", 10000.0);
            conversionFactor.put("kl_dal", 100.0);
            conversionFactor.put("kl_hl", 10.0);

            String Key = from + "_" + to;
            if(conversionFactor.containsKey(Key)) {
                convertedValue = conversions.getEntryValue() * conversionFactor.get(Key);
            }else{
                throw new IllegalArgumentException("Invalid conversion pair");
            }

            conversions.setResult(convertedValue);
            conversionRepository.save(conversions);
        }
        CalculateVolumeResponse response = new CalculateVolumeResponse();
        response.setConvertFrom(conversions.getConvertFrom());
        response.setConvertTo(conversions.getConvertTo());
        response.setEntryValue(conversions.getEntryValue());
        response.setResult(convertedValue);
        return response;
    }

    @Override
    public CalculateTimeResponse calculateTime(CalculateTimeRequest calculateTimeRequest) {
        Conversions conversions = new Conversions();
        conversions.setConvertFrom(calculateTimeRequest.getConvertFrom());
        conversions.setConvertTo(calculateTimeRequest.getConvertTo());
        conversions.setEntryValue(calculateTimeRequest.getEntryValue());

        double convertedValue = 0.00;

        if(conversions.getConvertFrom() != null && conversions.getConvertTo() != null){
            String from = conversions.getConvertFrom().toLowerCase();
            String to = conversions.getConvertTo().toLowerCase();

            Map<String, Double> conversionFactor = new HashMap<>();
            conversionFactor.put("sec_sec", 1.0);
            conversionFactor.put("sec_min", 1/60.0);
            conversionFactor.put("sec_hr", 1/3600.0);
            conversionFactor.put("sec_days", 1/86400.0);
            conversionFactor.put("sec_weeks", 1/604800.0);
            conversionFactor.put("sec_months", 1/2592000.0);
            conversionFactor.put("sec_years", 1/31536000.0);

            conversionFactor.put("min_sec", 60.0);
            conversionFactor.put("hr_sec", 3600.0);
            conversionFactor.put("days_sec", 86400.0);
            conversionFactor.put("week_sec", 604800.0);
            conversionFactor.put("month_sec", 2592000.0);
            conversionFactor.put("year_sec", 31536000.0);

            conversionFactor.put("min_hr", 1/60.0);
            conversionFactor.put("min_days", 1/1440.0);
            conversionFactor.put("min_weeks", 1/10080.0);
            conversionFactor.put("min_months", 1/43200.0);
            conversionFactor.put("min_years", 1/525600.0);

            conversionFactor.put("hr_min", 60.0);
            conversionFactor.put("days_min", 1440.0);
            conversionFactor.put("week_min", 10080.0);
            conversionFactor.put("month_min", 43200.0);
            conversionFactor.put("year_min", 525600.0);

            conversionFactor.put("hr_hr", 1.0);
            conversionFactor.put("days_hr", 24.0);
            conversionFactor.put("week_hr", 168.0);
            conversionFactor.put("month_hr", 720.0);
            conversionFactor.put("year_hr", 8760.0);

            conversionFactor.put("hr_days", 1/24.0);
            conversionFactor.put("hr_weeks", 1/168.0);
            conversionFactor.put("hr_months", 1/720.0);
            conversionFactor.put("hr_years", 1/8760.0);

            conversionFactor.put("days_days", 1.0);
            conversionFactor.put("weeks_days", 7.0);
            conversionFactor.put("months_days", 30.44);
            conversionFactor.put("years_days", 365.0);

            conversionFactor.put("days_weeks",1/7.0);
            conversionFactor.put("days_months", 1/30.44);
            conversionFactor.put("days_years", 1/365.0);

            conversionFactor.put("weeks_weeks", 1.0);
            conversionFactor.put("months_weeks", 4345.0);
            conversionFactor.put("years_weeks", 52.14);

            conversionFactor.put("weeks_months",1/4345.0);
            conversionFactor.put("weeks_years", 1/52.14);

            conversionFactor.put("months_months", 1.0);
            conversionFactor.put("years_months", 12.0);

            conversionFactor.put("months_years",1/12.0);

            String key = from + "_" + to;
            if(conversionFactor.containsKey(key)){
                convertedValue = conversions.getEntryValue() * conversionFactor.get(key);
            }else{
                throw new IllegalArgumentException("Pair does not exist");
            }

            conversions.setResult(convertedValue);
            conversionRepository.save(conversions);

        }
        CalculateTimeResponse response = new CalculateTimeResponse();
        response.setConvertTo(conversions.getConvertTo());
        response.setConvertFrom(conversions.getConvertFrom());
        response.setEntryValue(conversions.getEntryValue());
        response.setResult(convertedValue);
        return response;
    }

    @Override
    public CalculateMassResponse calculateMass(CalculateMassRequest calculateMassRequest) {
        Conversions conversions = new Conversions();
        conversions.setConvertFrom(calculateMassRequest.getConvertFrom());
        conversions.setConvertTo(calculateMassRequest.getConvertTo());
        conversions.setEntryValue(calculateMassRequest.getEntryValue());

        double convertedValue = 0.00;
        if(conversions.getConvertFrom() != null && conversions.getConvertTo() != null) {
            String from = conversions.getConvertFrom().toLowerCase();
            String to = conversions.getConvertTo().toLowerCase();

            Map<String, Double> conversionFactor = new HashMap<>();
            conversionFactor.put("mg_mg", 1.0);
            conversionFactor.put("g_mg", 1000.0);
            conversionFactor.put("dg_mg", 100.0);
            conversionFactor.put("dag_mg", 10.0);
            conversionFactor.put("hg_mg", 100.0);
            conversionFactor.put("kg_mg", 1000.0);
            conversionFactor.put("t_mg", 1000000.0);

            conversionFactor.put("mg_g", 0.001);
            conversionFactor.put("mg_dg", 0.01);
            conversionFactor.put("mg_dag", 0.1);
            conversionFactor.put("mg_hg", 0.01);
            conversionFactor.put("mg_kg", 0.0001);
            conversionFactor.put("mg_t", 0.000001);

            conversionFactor.put("g_g", 1.0);
            conversionFactor.put("dg_g", 0.1);
            conversionFactor.put("dag_g", 10.0);
            conversionFactor.put("hg_g", 100.0);
            conversionFactor.put("kg_g", 1000.0);
            conversionFactor.put("t_g", 1000.0);

            conversionFactor.put("g_dg", 10.0);
            conversionFactor.put("g_dag", 0.1);
            conversionFactor.put("g_hg", 0.01);
            conversionFactor.put("g_kg", 0.001);
            conversionFactor.put("g_t", 0.001);

            conversionFactor.put("dag_dg", 100.0);
            conversionFactor.put("hg_dg", 1000.0);
            conversionFactor.put("kg_dg", 10000.0);
            conversionFactor.put("t_dg", 10000.0);

            conversionFactor.put("dg_dg", 1.0);
            conversionFactor.put("dg_dag", 0.01);
            conversionFactor.put("dg_hg", 0.01);
            conversionFactor.put("dg_kg", 0.0001);
            conversionFactor.put("dg_t", 0.000001);

            conversionFactor.put("dag_kg", 0.01);
            conversionFactor.put("hg_kg", 0.1);
            conversionFactor.put("t_kg", 1000.0);

            conversionFactor.put("kg_dag", 100.0);
            conversionFactor.put("kg_hg", 10.0);
            conversionFactor.put("kg_kg", 1.0);
            conversionFactor.put("kg_t", 0.001);

            String key = from + "_" + to;
            if(conversionFactor.containsKey(key)) {
                convertedValue = conversions.getEntryValue() * conversionFactor.get(key);
            }else{
                throw new IllegalArgumentException("Invalid conversion pair");
            }
            conversions.setResult(convertedValue);
            conversionRepository.save(conversions);
        }
        CalculateMassResponse response = new CalculateMassResponse();
        response.setConvertFrom(conversions.getConvertFrom());
        response.setConvertTo(conversions.getConvertTo());
        response.setEntryValue(conversions.getEntryValue());
        response.setResult(convertedValue);
        return response;
    }

    @Override
    public CalculateTemperatureResponse calculateTemperature(CalculateTemperatureRequest calculateTemperatureRequest) {
        Conversions conversions = new Conversions();
        conversions.setConvertFrom(calculateTemperatureRequest.getConvertFrom());
        conversions.setConvertTo(calculateTemperatureRequest.getConvertTo());
        conversions.setEntryValue(calculateTemperatureRequest.getEntryValue());

        double convertedValue = 0.00;

        if (conversions.getConvertFrom() != null && conversions.getConvertTo() != null) {
            String from = conversions.getConvertFrom().trim().replace("°", "");
            String to = conversions.getConvertTo().trim().replace("°", "");


            if (from.equalsIgnoreCase("C") && to.equalsIgnoreCase("F")) {
                convertedValue = (conversions.getEntryValue() * (9.0 / 5.0)) + 32;
            } else if (from.equalsIgnoreCase("F") && to.equalsIgnoreCase("C")) {
                convertedValue = (conversions.getEntryValue() - 32) * (5.0 / 9.0);
            } else if(from.equalsIgnoreCase("C") && to.equalsIgnoreCase("K")){
                convertedValue = (conversions.getEntryValue() + 273.15);
            }else if(from.equalsIgnoreCase("K") && to.equalsIgnoreCase("C")){
                convertedValue = (conversions.getEntryValue() - 273.15);
            }else if(from.equalsIgnoreCase("F") && to.equalsIgnoreCase("K")){
                convertedValue = ((conversions.getEntryValue() - 32) * 5.0/9.0) + 273.15;
            }else if(from.equalsIgnoreCase("K") && to.equalsIgnoreCase("F")){
                convertedValue = ((conversions.getEntryValue() - 273.15) * 9.0/5.0) + 32;
            }

            else {
                throw new IllegalArgumentException("Invalid conversion pair: " + from + " to " + to);
            }

            conversions.setResult(convertedValue);
            conversionRepository.save(conversions);
        }

        CalculateTemperatureResponse response = new CalculateTemperatureResponse();
        response.setConvertFrom(conversions.getConvertFrom());
        response.setConvertTo(conversions.getConvertTo());
        response.setEntryValue(conversions.getEntryValue());
        response.setResult(convertedValue);

        return response;
    }

}
