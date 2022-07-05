import request from '@/utils/request'

// 查询user_info列表
export function listInfo(query) {
  return request({
    url: '/system/info/list',
    method: 'get',
    params: query
  })
}

// 查询user_info详细
export function getInfo(id) {
  return request({
    url: '/system/info/' + id,
    method: 'get'
  })
}

// 新增user_info
export function addInfo(data) {
  return request({
    url: '/system/info',
    method: 'post',
    data: data
  })
}

// 修改user_info
export function updateInfo(data) {
  return request({
    url: '/system/info',
    method: 'put',
    data: data
  })
}

// 删除user_info
export function delInfo(id) {
  return request({
    url: '/system/info/' + id,
    method: 'delete'
  })
}
