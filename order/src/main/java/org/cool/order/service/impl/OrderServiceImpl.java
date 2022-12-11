package org.cool.order.service.impl;

import org.cool.order.dao.OrderDao;
import org.cool.order.pojo.Order;
import org.cool.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDao orderDao;

    @Override
    public Order getOrder(Long id) {
        return orderDao.selectById(id);
    }
}
