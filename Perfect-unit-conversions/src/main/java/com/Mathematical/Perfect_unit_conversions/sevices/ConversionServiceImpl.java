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
        return null;
    }

    @Override
    public CalculateVolumeResponse calculateVolume(CalculateVolumeRequest calculateVolumeRequest) {
        return null;
    }

    @Override
    public CalculateTimeResponse calculateTime(CalculateTimeRequest calculateTimeRequest) {
        return null;
    }

    @Override
    public CalculateMassResponse calculateMass(CalculateMassRequest calculateMassRequest) {
        return null;
    }

    @Override
    public CalculateTemperatureResponse calculateTemperature(CalculateTemperatureRequest calculateTemperatureRequest) {
        return null;
    }
}
