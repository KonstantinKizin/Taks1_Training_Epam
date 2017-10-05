package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.FileNotFoundException;
import java.util.List;

public interface ApplianceDAO {

	<E> Appliance find(Criteria<E> criteria);

	<E> boolean add(Criteria<E> criteria);

	<E> boolean delete(Criteria<E> criteria);

	<E> void updateOrAdd(Criteria<E> criteria);

	<E> List<Appliance> getAll();



}
