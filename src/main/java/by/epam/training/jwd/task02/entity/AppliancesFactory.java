package by.epam.training.jwd.task02.entity;

import by.epam.training.jwd.task02.entity.appliance.*;
import by.epam.training.jwd.task02.task02.entity.appliance.*;

import java.util.ArrayList;
import java.util.List;


public final class AppliancesFactory {
    private static AppliancesFactory instance = new AppliancesFactory();

    private AppliancesFactory(){}

    public static AppliancesFactory getInstance(){
        return instance;
    }

    public List<Appliance> getAppliance(List<String> list) {
        List <Appliance> appliancesList = new ArrayList<>();
        if (list.size()==0) {
            return new ArrayList<>();
        }
        //finding type of object
        if (list.get(0).equalsIgnoreCase("Oven")) {
            int numberOfFields = Oven.class.getDeclaredFields().length + 1;
            int objectsToReturnCounter = list.size() / numberOfFields;
            for (int i = 0; i < objectsToReturnCounter; i++) {
                //creation of new object in 7 strings of ArrayList<String> list
                Oven oven = new Oven();
                for (int j = i * 7 + 1; j < list.size(); j++) {
                    //exit from cycle if (string's number in parameter "list" % numberOfFields)==0
                    if (j % numberOfFields == 0) {
                        break;
                    }
                    String[] array = list.get(j).split("=");
                    if (array[0].equalsIgnoreCase("power_consumption")) {
                        oven.setPowerConsumption(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("weight")) {
                        oven.setWeight(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("capacity")) {
                        oven.setCapacity(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("depth")) {
                        oven.setDepth(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("height")) {
                        oven.setHeight(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("width")) {
                        oven.setWidth(Double.parseDouble(array[1]));
                    }
                }
                appliancesList.add(oven);
            }
        }

         else if (list.get(0).equalsIgnoreCase("Laptop")) {
            int numberOfFields = Laptop.class.getDeclaredFields().length + 1;
            int objectsToReturnCounter = list.size() / numberOfFields;
            for (int i = 0; i < objectsToReturnCounter; i++) {

                Laptop laptop = new Laptop();
                for (int j = i * 7 + 1; j < list.size(); j++) {

                    if (j % numberOfFields == 0) {
                        break;
                    }
                    String[] array = list.get(j).split("=");
                    if (array[0].equalsIgnoreCase("battery_capacity")) {
                        laptop.setBatteryCapacity(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("os")) {
                        laptop.setOperationSystem(array[1]);
                    } else if (array[0].equalsIgnoreCase("memory_rom")) {
                        laptop.setMemoryRom(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("system_memory")) {
                        laptop.setSystemMemory(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("cpu")) {
                        laptop.setProcessor(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("display_inchs")) {
                        laptop.setDisplayInches(Double.parseDouble(array[1]));
                    }
                }
                appliancesList.add(laptop);
            }
        }

        else if (list.get(0).equalsIgnoreCase("Refrigerator")) {
            int numberOfFields = Refrigerator.class.getDeclaredFields().length + 1;
            int objectsToReturnCounter = list.size() / numberOfFields;
            for (int i = 0; i < objectsToReturnCounter; i++) {
                Refrigerator refrigerator = new Refrigerator();
                for (int j = i * 7 + 1; j < list.size(); j++) {

                    if (j % numberOfFields == 0) {
                        break;
                    }
                    String[] array = list.get(j).split("=");
                    if (array[0].equalsIgnoreCase("power_consumption")) {
                        refrigerator.setPowerConsumption(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("weight")) {
                        refrigerator.setWeight(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("freezer_capacity")) {
                        refrigerator.setFreezerCapacity(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("overall_capacity")) {
                        refrigerator.setOverallCapacity(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("height")) {
                        refrigerator.setHeight(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("width")) {
                        refrigerator.setWidth(Double.parseDouble(array[1]));
                    }
                }
                appliancesList.add(refrigerator);
            }
        }

       else if (list.get(0).equalsIgnoreCase("VacuumCleaner")) {
            int numberOfFields = VacuumCleaner.class.getDeclaredFields().length + 1;
            int objectsToReturnCounter = list.size() / numberOfFields;
            for (int i = 0; i < objectsToReturnCounter; i++) {
                VacuumCleaner vacuumCleaner = new VacuumCleaner();
                for (int j = i * 7 + 1; j < list.size(); j++) {
                    if (j % numberOfFields == 0) {
                        break;
                    }
                    String[] array = list.get(j).split("=");
                    if (array[0].equalsIgnoreCase("power_consumption")) {
                        vacuumCleaner.setPowerConsumption(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("filter_type")) {
                        vacuumCleaner.setFilterType(array[1]);
                    } else if (array[0].equalsIgnoreCase("bag_type")) {
                        vacuumCleaner.setBagType(array[1]);
                    } else if (array[0].equalsIgnoreCase("wand_type")) {
                        vacuumCleaner.setWandType(array[1]);
                    } else if (array[0].equalsIgnoreCase("motor_speed_regulation")) {
                        vacuumCleaner.setMotorSpeedRegulation(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("cleaning_width")) {
                        vacuumCleaner.setCleaningWidth(Double.parseDouble(array[1]));
                    }
                }
                appliancesList.add(vacuumCleaner);
            }
        }

       else if (list.get(0).equalsIgnoreCase("TabletPC")) {
            int numberOfFields = TabletPC.class.getDeclaredFields().length + 1;
            int objectsToReturnCounter = list.size() / numberOfFields;
            for (int i = 0; i < objectsToReturnCounter; i++) {
                //creation of new object in 6 strings of ArrayList<String> list
                TabletPC tabletPC = new TabletPC();
                for (int j = i * 5 + 1; j < list.size(); j++) {
                    //exit from cycle if (string's number in parameter "list" % numberOfFields)==0
                    if (j % numberOfFields == 0) {
                        break;
                    }
                    String[] array = list.get(j).split("=");
                    if (array[0].equalsIgnoreCase("battery_capacity")) {
                        tabletPC.setBatteryCapacity(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("dispaly_inches")) {
                        tabletPC.setDisplayInches(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("memory_rom")) {
                        tabletPC.setMemoryRom(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("flash_memory_capacity")) {
                        tabletPC.setFlashMemoryCapacity(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("color")) {
                        tabletPC.setColor(array[1]);
                    }
                }
                appliancesList.add(tabletPC);
            }
        }

        else if (list.get(0).equalsIgnoreCase("Speakers")) {
            int numberOfFields = Speakers.class.getDeclaredFields().length + 1;
            int objectsToReturnCounter = list.size() / numberOfFields;
            for (int i = 0; i < objectsToReturnCounter; i++) {
                //creation of new object in 5 strings of ArrayList<String> list
                Speakers speakers = new Speakers();
                for (int j = i * 4 + 1; j < list.size(); j++) {
                    //exit from cycle if (string's number in parameter "list" % numberOfFields)==0
                    if (j % numberOfFields == 0) {
                        break;
                    }
                    String[] array = list.get(j).split("=");
                    if (array[0].equalsIgnoreCase("power_consumption")) {
                        speakers.setPowerConsumption(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("number_of_speakers")) {
                        speakers.setNumberOfSpeakers(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("frequency_range")) {
                        speakers.setFrequencyRange(Double.parseDouble(array[1]));
                    } else if (array[0].equalsIgnoreCase("cord_length")) {
                        speakers.setCordLength(Double.parseDouble(array[1]));

                    }
                    appliancesList.add(speakers);
                }
            }
        }
    return appliancesList;}
}
