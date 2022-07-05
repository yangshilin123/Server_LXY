import request from '@/utils/request'

// 查询私信信息列表
export function listMsg(query) {
  return request({
    url: '/system/msg/list',
    method: 'get',
    params: query
  })
}

// 查询私信信息详细
export function getMsg(id) {
  return request({
    url: '/system/msg/' + id,
    method: 'get'
  })
}

// 新增私信信息
export function addMsg(data) {
  return request({
    url: '/system/msg',
    method: 'post',
    data: data
  })
}

// 修改私信信息
export function updateMsg(data) {
  return request({
    url: '/system/msg',
    method: 'put',
    data: data
  })
}

// 删除私信信息
export function delMsg(id) {
  return request({
    url: '/system/msg/' + id,
    method: 'delete'
  })
}
