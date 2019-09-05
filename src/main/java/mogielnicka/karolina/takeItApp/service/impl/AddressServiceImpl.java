package mogielnicka.karolina.takeItApp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mogielnicka.karolina.takeItApp.dao.AddressDAO;
import mogielnicka.karolina.takeItApp.dto.AddressDTO;
import mogielnicka.karolina.takeItApp.model.Address;
import mogielnicka.karolina.takeItApp.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressDAO addressDao;

	@Override
	public List<AddressDTO> listAddress() {
		Iterable<Address> addresses = addressDao.findAll();
		List<AddressDTO> result = new ArrayList<AddressDTO>();

		for (Address address : addresses) {
			AddressDTO addressDto = new AddressDTO();
			BeanUtils.copyProperties(address, addressDto);
			result.add(addressDto);
		}

		return result;
	}

	@Override
	public void saveAddress(AddressDTO addressDto) {
		Address address = new Address();
		BeanUtils.copyProperties(addressDto, address);
		addressDao.save(address);

	}

	@Override
	public boolean deleteAddress(AddressDTO addressDto) {
		Long addressId = addressDto.getId();
		if (addressDao.existsById(addressId)) {
			addressDao.deleteById(addressId);
			return true;
		}
		return false;
	}

}
