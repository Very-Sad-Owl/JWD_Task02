package by.epam.training.jwd.task02.entity;

import by.epam.training.jwd.task02.entity.appliance.*;

import java.util.ArrayList;
import java.util.List;

//вынести стрроки в константы
public final class AppliancesFactory {
    private static AppliancesFactory instance = new AppliancesFactory();

    private AppliancesFactory(){}

    public static AppliancesFactory getInstance(){
        return instance;
    }

    // собирвем объекты из листа
    public List<Appliance> getAppliance(List<String> list) {
        //System.out.println(list);

        List <Appliance> appliances = new ArrayList<>();
        if (list.size()==0) {
            return new ArrayList<>();
        }

        if (list.get(0).equalsIgnoreCase("Oven")) {
            int fieldsNum = Oven.class.getDeclaredFields().length;
            int fieldsNumInList = fieldsNum + 1;
            int limit = list.size() / (fieldsNum + 1); //кол-во записей

            for (int i = 0; i < limit; i++) {
                Oven oven = new Oven();
                for (int j = i * fieldsNumInList + 1; j < list.size(); j++) {
                    if (j % fieldsNum == 0) {
                        break;
                    }
                    String[] fields = list.get(j).split("=");
                    if (fields[0].equalsIgnoreCase("power_consumption")) {
                        oven.setPowerConsumption(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("weight")) {
                        oven.setWeight(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("capacity")) {
                        oven.setCapacity(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("depth")) {
                        oven.setDepth(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("height")) {
                        oven.setHeight(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("width")) {
                        oven.setWidth(Double.parseDouble(fields[1]));
                    }
                }
                appliances.add(oven);
            }
        }

         else if (list.get(0).equalsIgnoreCase("Laptop")) {
            int fieldsNum = Laptop.class.getDeclaredFields().length;
            int fieldsNumInList = fieldsNum + 1;
            int limit = list.size() / (fieldsNum + 1); //кол-во записей

            for (int i = 0; i < limit; i++) {

                Laptop laptop = new Laptop();
                for (int j = i * fieldsNumInList + 1; j < list.size(); j++) {

                    if (j % fieldsNum == 0) {
                        break;
                    }
                    String[] fields = list.get(j).split("=");
                    if (fields[0].equalsIgnoreCase("battery_capacity")) {
                        laptop.setBatteryCapacity(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("os")) {
                        laptop.setOperationSystem(fields[1]);
                    } else if (fields[0].equalsIgnoreCase("memory_rom")) {
                        laptop.setMemoryRom(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("system_memory")) {
                        laptop.setSystemMemory(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("cpu")) {
                        laptop.setProcessor(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("display_inchs")) {
                        laptop.setDisplayInches(Double.parseDouble(fields[1]));
                    }
                }
                appliances.add(laptop);
            }
        }

        else if (list.get(0).equalsIgnoreCase("Refrigerator")) {
            int fieldsNum = Refrigerator.class.getDeclaredFields().length;
            int fieldsNumInList = fieldsNum + 1;
            int limit = list.size() / (fieldsNum + 1); //кол-во записей

            for (int i = 0; i < limit; i++) {
                Refrigerator refrigerator = new Refrigerator();
                for (int j = i * fieldsNumInList + 1; j < list.size(); j++) {

                    if (j % fieldsNum == 0) {
                        break;
                    }
                    String[] fields = list.get(j).split("=");
                    if (fields[0].equalsIgnoreCase("power_consumption")) {
                        refrigerator.setPowerConsumption(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("weight")) {
                        refrigerator.setWeight(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("freezer_capacity")) {
                        refrigerator.setFreezerCapacity(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("overall_capacity")) {
                        refrigerator.setOverallCapacity(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("height")) {
                        refrigerator.setHeight(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("width")) {
                        refrigerator.setWidth(Double.parseDouble(fields[1]));
                    }
                }
                appliances.add(refrigerator);
            }
        }

       else if (list.get(0).equalsIgnoreCase("VacuumCleaner")) {
            int fieldsNum = Refrigerator.class.getDeclaredFields().length;
            int fieldsNumInList = fieldsNum + 1;
            int limit = list.size() / (fieldsNum + 1); //кол-во записей

            for (int i = 0; i < limit; i++) {
                VacuumCleaner vacuumCleaner = new VacuumCleaner();
                for (int j = i * fieldsNumInList + 1; j < list.size(); j++) {
                    if (j % fieldsNum == 0) {
                        break;
                    }
                    String[] fields = list.get(j).split("=");
                    if (fields[0].equalsIgnoreCase("power_consumption")) {
                        vacuumCleaner.setPowerConsumption(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("filter_type")) {
                        vacuumCleaner.setFilterType(fields[1]);
                    } else if (fields[0].equalsIgnoreCase("bag_type")) {
                        vacuumCleaner.setBagType(fields[1]);
                    } else if (fields[0].equalsIgnoreCase("wand_type")) {
                        vacuumCleaner.setWandType(fields[1]);
                    } else if (fields[0].equalsIgnoreCase("motor_speed_regulation")) {
                        vacuumCleaner.setMotorSpeedRegulation(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("cleaning_width")) {
                        vacuumCleaner.setCleaningWidth(Double.parseDouble(fields[1]));
                    }
                }
                appliances.add(vacuumCleaner);
            }
        }

       else if (list.get(0).equalsIgnoreCase("TabletPC")) {
            int fieldsNum = TabletPC.class.getDeclaredFields().length;
            int fieldsNumInList = fieldsNum + 1;
            int limit = list.size() / (fieldsNum + 1); //кол-во записей

            for (int i = 0; i < limit; i++) {
                TabletPC tabletPC = new TabletPC();
                for (int j = i * fieldsNumInList + 1; j < list.size(); j++) {
                    if (j % fieldsNum == 0) {
                        break;
                    }
                    String[] fields = list.get(j).split("=");
                    if (fields[0].equalsIgnoreCase("battery_capacity")) {
                        tabletPC.setBatteryCapacity(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("dispaly_inches")) {
                        tabletPC.setDisplayInches(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("memory_rom")) {
                        tabletPC.setMemoryRom(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("flash_memory_capacity")) {
                        tabletPC.setFlashMemoryCapacity(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("color")) {
                        tabletPC.setColor(fields[1]);
                    }
                }
                appliances.add(tabletPC);
            }
        }

        else if (list.get(0).equalsIgnoreCase("Speakers")) {
            int fieldsNum = Speakers.class.getDeclaredFields().length;
            int fieldsNumInList = fieldsNum + 1;
            int limit = list.size() / (fieldsNum + 1); //кол-во записей

            for (int i = 0; i < limit; i++) {
                Speakers speakers = new Speakers();
                for (int j = i * fieldsNumInList + 1; j < list.size(); j++) {
                    if (j % fieldsNum == 0) {
                        break;
                    }
                    String[] fields = list.get(j).split("=");
                    if (fields[0].equalsIgnoreCase("power_consumption")) {
                        speakers.setPowerConsumption(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("number_of_speakers")) {
                        speakers.setNumberOfSpeakers(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("frequency_range")) {
                        speakers.setFrequencyRange(Double.parseDouble(fields[1]));
                    } else if (fields[0].equalsIgnoreCase("cord_length")) {
                        speakers.setCordLength(Double.parseDouble(fields[1]));

                    }
                    appliances.add(speakers);
                }
            }
        }
    return appliances;}
}
