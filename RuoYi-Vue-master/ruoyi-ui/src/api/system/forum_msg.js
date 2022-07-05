import request from '@/utils/request'

// 查询论坛信息列表
export function listForum_msg(query) {
  return request({
    url: '/system/forum_msg/list',
    method: 'get',
    params: query
  })
}

// 查询论坛信息详细
export function getForum_msg(id) {
  return request({
    url: '/system/forum_msg/' + id,
    method: 'get'
  })
}

// 新增论坛信息
export function addForum_msg(data) {
  return request({
    url: '/system/forum_msg',
    method: 'post',
    data: data
  })
}

// 修改论坛信息
export function updateForum_msg(data) {
  return request({
    url: '/system/forum_msg',
    method: 'put',
    data: data
  })
}

// 删除论坛信息
export function delForum_msg(id) {
  return request({
    url: '/system/forum_msg/' + id,
    method: 'delete'
  })
}
