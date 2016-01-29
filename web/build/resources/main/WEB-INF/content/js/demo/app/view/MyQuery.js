/*
 * File: app/view/MyQuery.js
 *
 * This file was generated by Sencha Architect version 2.0.0.
 * http://www.sencha.com/products/architect/
 *
 * This file requires use of the Ext JS 4.0.x library, under independent license.
 * License of Sencha Architect does not include license for Ext JS 4.0.x. For more
 * details see http://www.sencha.com/license or contact license@sencha.com.
 *
 * This file will be auto-generated each and everytime you save your project.
 *
 * Do NOT hand edit this file.
 */

Ext.define('MyApp.view.MyQuery', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.MyQuery',

    itemId: 'historyQuery',
    layout: {
        type: 'border'
    },
    title: '表格',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            dockedItems: [
                {
                    xtype: 'toolbar',
                    height: 30,
                    region: 'north',
                    dock: 'top',
                    items: [
                        {
                            xtype: 'label',
                            text: '从'
                        },
                        {
                            xtype: 'datefield'
                        },
                        {
                            xtype: 'label',
                            text: '到'
                        },
                        {
                            xtype: 'datefield'
                        },
                        {
                            xtype: 'button',
                            itemId: 'btnQry',
                            text: '查询'
                        }
                    ]
                }
            ],
            items: [
                {
                    xtype: 'gridpanel',
                    store: 'MyQueryStore',
                    region: 'center',
                    columns: [
                        {
                            xtype: 'gridcolumn',
                            width: 208,
                            dataIndex: 'name',
                            text: '名称'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 235,
                            dataIndex: 'data1',
                            text: '指标1'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 253,
                            dataIndex: 'data2',
                            text: '指标2'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 226,
                            dataIndex: 'data3',
                            text: '指标3'
                        }
                    ],
                    viewConfig: {

                    },
                    dockedItems: [
                        {
                            xtype: 'pagingtoolbar',
                            displayInfo: true,
                            store: 'MyQueryStore',
                            dock: 'bottom'
                        }
                    ]
                }
            ]
        });

        me.callParent(arguments);
    }

});