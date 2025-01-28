package com.Mathematical.Perfect_unit_conversions.sevices;

import com.Mathematical.Perfect_unit_conversions.dtos.request.*;
import com.Mathematical.Perfect_unit_conversions.dtos.request.*;
import com.Mathematical.Perfect_unit_conversions.dtos.response.*;
import org.springframework.stereotype.Service;

@Service
public interface ConversionService {

    CalculateLengthResponse calculateLength(CalculateLengthRequest calculateLengthRequest);
    CalculateAreaResponse calculateArea(CalculateAreaRequest calculateAreaRequest);
    CalculateVolumeResponse calculateVolume(CalculateVolumeRequest calculateVolumeRequest);
    CalculateTimeResponse calculateTime(CalculateTimeRequest calculateTimeRequest);
    CalculateMassResponse calculateMass(CalculateMassRequest calculateMassRequest);
    CalculateTemperatureResponse calculateTemperature(CalculateTemperatureRequest calculateTemperatureRequest);


}